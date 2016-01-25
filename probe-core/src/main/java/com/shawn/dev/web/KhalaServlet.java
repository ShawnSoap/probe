package com.shawn.dev.web;

import com.shawn.dev.Probe;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Qijun on 2016/1/25.
 */
@WebServlet
public class KhalaServlet extends HttpServlet {

    private Probe probe = new Probe();

    public KhalaServlet() {

    }

    @Override
    public void init(ServletConfig config) {

    }

    @Override
    public void service(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {

    }

}
