package com.shawn.dev.route;

import com.google.common.collect.Collections2;
import com.shawn.dev.web.http.HttpRequestMethod;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Qijun on 2016/1/25.
 */
public class Routers {

    private static final Logger LOGGER = LoggerFactory.getLogger(Routers.class);

    private Map<String, Router> routers = null;

    public void addRouter(Router router) {

        if (MapUtils.isEmpty(routers)) {
            routers = new LinkedHashMap<String, Router>();
        }

        // if there is already a router with both same path and same HttpRequestMethod
        if (routers.containsKey(router.getPath()) && routers.get(router.getPath()).getMethod() == router.getMethod()) {
            LOGGER.error("Request path of {} with request method {} is already registered in the system",
                    router.getPath(), router.getHttpRequestMethod().toString());
            throw new RouterException("Duplicated Router Settings");
        } else {
            routers.put(router.getPath() + "#" + router.getHttpRequestMethod(), router);
        }

    }

    public void addRouters(List<Router> routers) {
        for (Router router : routers) {
            addRouter(router);
        }
    }

    public void addRouter(HttpRequestMethod httpRequestMethod, String path, Object target, Method method) {
        Router router = new Router(httpRequestMethod, path, target, method);
        addRouter(router);
    }

    public Map<String, Router> getRouters() {
        return routers;
    }

    public void setRouters(Map<String, Router> routers) {
        this.routers = routers;
    }
}
