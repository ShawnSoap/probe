package com.shawn.dev.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by Qijun on 2016/1/25.
 */
public class Routers {

    private static final Logger LOGGER = LoggerFactory.getLogger(Routers.class);

    private Map<String, Router> routers = null;

    public void addRouter(Router router) {}


    public Map<String, Router> getRouters() {
        return routers;
    }

    public void setRouters(Map<String, Router> routers) {
        this.routers = routers;
    }
}
