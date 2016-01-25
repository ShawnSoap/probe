package com.shawn.dev.route;

import com.shawn.dev.web.http.HttpRequestMethod;

import java.lang.reflect.Method;

/**
 * Represent a mapping from a path pattern and HTTP request method to
 * certain method of an object that can handle the
 *
 * Created by Qijun on 2016/1/25.
 */
public class Router {

    private HttpRequestMethod httpRequestMethod;

    private String path;

    private Object target;

    private Method method;

    public Router() {

    }

    public Router(HttpRequestMethod httpRequestMethod, String path, Object target, Method method) {
        this.httpRequestMethod = httpRequestMethod;
        this.path = path;
        this.target = target;
        this.method = method;
    }

    public HttpRequestMethod getHttpRequestMethod() {
        return httpRequestMethod;
    }

    public void setHttpRequestMethod(HttpRequestMethod httpRequestMethod) {
        this.httpRequestMethod = httpRequestMethod;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Router router = (Router) o;

        if (httpRequestMethod != router.httpRequestMethod) return false;
        if (path != null ? !path.equals(router.path) : router.path != null) return false;
        if (target != null ? !target.equals(router.target) : router.target != null) return false;
        return method != null ? method.equals(router.method) : router.method == null;

    }

    @Override
    public int hashCode() {
        int result = httpRequestMethod != null ? httpRequestMethod.hashCode() : 0;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (method != null ? method.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return httpRequestMethod.toString() + "\t" + path + "\t" + target.toString();
    }

}
