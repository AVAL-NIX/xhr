<template>
  <el-form :rules="rules"
           class="login-container"
           laber-position="left"
           laber-width="0px"
           v-loading="loading">
    <h3 class="login_title">系统登录</h3>
    <el-form-item prop="account">
      <el-input type="text"
                v-model="loginForm.username"
                auto-complete="off"
                placeholder="帐号">
      </el-input>
    </el-form-item>
    <el-form-item prop="checkPass">
      <el-input type="password"
                v-model="loginForm.password"
                auto-complete="off"
                placeholder="密码">
      </el-input>
    </el-form-item>
    <el-checkbox class="login_remember"
              v-model="checked"
              label-position="left">
      记住密码
    </el-checkbox>
    <el-button type="primary"
               style="width:100%"
               @click="submitClick"> 登录</el-button>
  </el-form>
</template>

<script>
import { mapState, mapMutations, mapGetters, mapActions } from 'vuex'
export default {
  data () {
    return {
      rules: {
        account: [{ required: true, message: '请输入用户名', trigger: 'blur' }],
        checkPass: [{ required: true, message: '请输入密码', trigger: 'blur' }],
      },
      checked: true,
      loginForm: {
        username: 'admin',
        password: '123'
      },
      loading: false
    }
  },
  methods: {
    ...mapMutations('Login', {
    }),
    submitClick () {
      var _this = this
      this.loading = true
      this.$post('/login', {
        username: this.loginForm.username,
        password: this.loginForm.password
      }).then(res => {
        _this.loading = false
        console.log("正常了", res)
        if (res && res.status == 200) {
          let data = res.data
          console.log("data",data, _this.$store.commit)
          _this.$store.commit('Login/loginData', data.obj)
          let path = _this.$route.query.redirect
          console.log("path",path)
          _this.$router.replace({ path: path == "/" || path == undefined ? '/home' : path })
        }
      }).catch(res=>{
           _this.loading = false
            console.log("异常了", res)
      })
    }
  }
}
</script>

<style>
.login-container {
  border-radius: 15px;
  background-clip: padding-box;
  margin: 180px auto;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}
.login_title{
    margin: 0px auto 40px auto;
    text-align: center;
    color:#505458;
}
.login_remember{
    margin: 0px 0px 35px 0px;
    text-align:left;
}
</style>