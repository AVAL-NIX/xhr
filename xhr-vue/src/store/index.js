import Vue from 'vue'
import Vuex from 'vuex'
import Login from './modules/login/login'
import Home from './modules/home/home'

Vue.use(Vuex)


export default new Vuex.Store({
    modules: {
        Login,
        Home,
    }
  })