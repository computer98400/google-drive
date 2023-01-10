
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveManager from "./components/listers/DriveCards"
import DriveDetail from "./components/listers/DriveDetail"


import DashBoardView from "./components/DashBoardView"
import DashBoardViewDetail from "./components/DashBoardViewDetail"
import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import VideoManager from "./components/listers/VideoCards"
import VideoDetail from "./components/listers/VideoDetail"

import NotificationManager from "./components/listers/NotificationCards"
import NotificationDetail from "./components/listers/NotificationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives',
                name: 'DriveManager',
                component: DriveManager
            },
            {
                path: '/drives/:id',
                name: 'DriveDetail',
                component: DriveDetail
            },


            {
                path: '/dashBoards',
                name: 'DashBoardView',
                component: DashBoardView
            },
            {
                path: '/dashBoards/:id',
                name: 'DashBoardViewDetail',
                component: DashBoardViewDetail
            },
            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/videos',
                name: 'VideoManager',
                component: VideoManager
            },
            {
                path: '/videos/:id',
                name: 'VideoDetail',
                component: VideoDetail
            },

            {
                path: '/notifications',
                name: 'NotificationManager',
                component: NotificationManager
            },
            {
                path: '/notifications/:id',
                name: 'NotificationDetail',
                component: NotificationDetail
            },



    ]
})
