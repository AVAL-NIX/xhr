// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import lang from 'element-ui/lib/locale/lang/en'
import locale from 'element-ui/lib/locale'

import Vuex from 'vuex'
Vue.use( Vuex );

import store from './store/index.js';
//引入axios请求
import api from './util/api';
// 初始化菜单
import {initMenu} from './util/utils';

Vue.prototype.$store = store


Vue.use(ElementUI)
locale.use(lang)

Vue.config.productionTip = false

// 前置拦截,判断每次路由是否要重新请求菜单
router.beforeEach((to,from,next)=>{
    if(to.name == 'Login'){
        next()
        return
    }
    console.log(" to ", to , from)
    let name = store.state.Login.hr.name
    console.log(" name 为" , name)
    if(!name){
        if(to.meta.requireAuth ||  to.name ==null){
            next({path:'/' , query:{redirect : to.path}})
        }else{
            next()
        }
    }else{
        initMenu(router, store)
        next()
    }
})

new Vue({
  el: '#app',
  router,
    store,
  components: { App },
  template: '<App/>'
})
