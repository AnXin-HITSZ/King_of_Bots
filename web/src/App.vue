<template>
  <NavBar />
  <router-view></router-view>
</template>

<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
import $ from 'jquery'

export default {
  components: {
    NavBar
  },
  setup() {
    $.ajax({
      url: "http://127.0.0.1:3000/user/account/token/",
      type: "post",
      data: {
        username: 'yxc',
        password: "pyxc",
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    });

    $.ajax({
      url: "http://127.0.0.1:3000/user/account/info/",
      type: "get",
      headers: {
        Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI5ZmRhMTk3ZjEyNDA0NGIwODI4NzNlMDE4YzE5NzZmZiIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTc2ODQ4Mjc0NiwiZXhwIjoxNzY5NjkyMzQ2fQ.Xw3uqGfizVZ5hxAU4TdqVXhb1IsqECtlZZkIY3x_tyU",
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    });
  }
}
</script>

<style>
body {
  background-image: url(@/assets/images/background.png);
  background-size: cover;
}
</style>
