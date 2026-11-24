package com.example.bmwe60idrive

import android.service.dreams.DreamService

class E60DreamService : DreamService() {
    private var dashboard: E60DashboardController? = null

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        isInteractive = true
        isFullscreen = true
        dashboard = E60DashboardController(this)
        setContentView(dashboard!!.rootView)
    }

    override fun onDetachedFromWindow() {
        dashboard?.stop()
        super.onDetachedFromWindow()
    }
}
