<template>
  <div id="base_login">
    <el-form
      :model="loginForm"
      :rules="rules"
      class="login_container"
      label-position="left"
      label-width="0px"
      v-loading="loading"
    >
      <h3 class="login_title">Save</h3>
      <el-form-item prop="username">
        <el-input
          type="text"
          v-model="loginForm.username"
          auto-complete="off"
          placeholder="username"
        ></el-input>
      </el-form-item>
      <el-form-item prop="nickname">
        <el-input
          type="text"
          v-model="loginForm.nickname"
          auto-complete="off"
          placeholder="nickname"
        ></el-input>
      </el-form-item>
      <el-form-item prop="password">
        <el-input
          type="text"
          v-model="loginForm.password"
          auto-complete="off"
          placeholder="password"
        ></el-input>
      </el-form-item>
      <el-form-item prop="address">
        <el-input
          type="text"
          v-model="loginForm.address"
          auto-complete="off"
          placeholder="address"
        ></el-input>
      </el-form-item>
      <el-form-item prop="phone">
        <el-input
          type="phone"
          v-model="loginForm.phone"
          auto-complete="off"
          placeholder="phone"
        ></el-input>
      </el-form-item>
      <el-form-item prop="authority">
        <el-input
          type="number"
          v-model="loginForm.authority"
          auto-complete="off"
          placeholder="authority"
        ></el-input>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button
          type="primary"
          style="width: 40%; background: #afb4db; border: none"
          v-on:click="save"
          >save</el-button
        >
        <el-button
          type="primary"
          style="width: 40%; background: #afb4db; border: none"
          v-on:click="checkpwd"
          >check</el-button
        >
        <el-button
          type="primary"
          style="width: 40%; background: #afb4db; border: none"
          v-on:click="findAll"
          >getAll</el-button
        >
      </el-form-item>
    </el-form>
    <div>{{ msg }}</div>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      loginForm: {
        username: "",
        nickname: "",
        password: "",
        address: "",
        phone: "",
        authority: "",
      },
      rules: {
        username: [{ required: true, message: "", trigger: "blur" }],
        nickname: [{ required: true, message: "", trigger: "blur" }],
        password: [{ required: true, message: "", trigger: "blur" }],
        address: [{ required: true, message: "", trigger: "blur" }],
        phone: [{ required: true, message: "", trigger: "blur" }],
        authority: [{ required: true, message: "", trigger: "blur" }],
      },
      loading: false,
      msg: "",
    };
  },
  methods: {
    save() {
      this.$axios
        .post("/api/register", {
          username: this.loginForm.username,
          nickname: this.loginForm.nickname,
          password: this.loginForm.password,
          address: this.loginForm.address,
          phone: this.loginForm.phone,
          authority: this.loginForm.authority,
        })
        .then((resp) => {
          if (resp.status === 200) {
            this.msg = resp.data;
          } else {
            alert("error");
          }
        })
        .catch((error) => {
          console.log(error);
          alert("error catch");
        });
    },
    checkpwd() {
      this.$axios
        .post("/api/login", {
          username: this.loginForm.username,
          nickname: "nickname",
          password: this.loginForm.password,
          address: "this.loginForm.address",
          phone: "12345678965",
          authority: "3",
        })
        .then((resp) => {
          if (resp.status === 200) {
            if(resp.data === ""){
              this.msg = "pwd wrong"
            } else {
              this.msg = resp.data
            };
          } else {
            alert("error");
          }
        })
        .catch((error) => {
          console.log(error);
          alert("error catch");
        });
    },
    findAll() {
      this.$axios
        .get("/api/all")
        .then((resp) => {
          if (resp.status === 200) {
            //this.msg = resp.data;
          } else {
            alert("error");
          }
        })
        .catch((error) => {
          console.log(error);
          alert("error catch");
        });
      this.$axios
        .get("/api2/goods/test")
        .then((resp) => {
          if (resp.status === 200) {
            this.msg = resp.data;
          } else {
            alert("error2");
          }
        })
        .catch((error) => {
          console.log(error);
          alert("error2 catch");
        });
    },
  },
};
</script>

<style scoped>
#base_login {
  background: url("../assets/background/checkerboard-cross.png") repeat;
  background-position: center;
  height: 100%;
  width: 100%;
  background-size: cover;
  position: fixed;
}
body {
  margin: 0px;
  padding: 0px;
}
.login_container {
  border-radius: 15px;
  background-clip: padding-box;
  margin: 90px auto;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}
.login_title {
  margin: 0px auto 40px auto;
  text-align: center;
  color: #494e8f;
}
</style>
