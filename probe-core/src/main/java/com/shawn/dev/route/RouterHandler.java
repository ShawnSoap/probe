package com.shawn.dev.route;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Qijun on 2016/1/25.
 */
public interface RouterHandler {

    public void handle(HttpServletRequest request, HttpServletResponse response);

}
