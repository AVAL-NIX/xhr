


const state = {
    hr: {},
    routes:[]
}

// getters
const getters = {}
// actions
const actions = {
   
}
// mutations
const mutations = {
    loginData(state, data){
        console.log("登录data",data)
        state.hr = data
    },
    initMenu(state, menus){
        console.log(" 提交到home sotre " , menus)
        state.routes = menus
    }
}


export default {
    namespaced: true,
    state,
    getters,
    actions,
    mutations
  }