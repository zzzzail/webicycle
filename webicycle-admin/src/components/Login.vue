<script setup lang="ts">
import router from "@/router";
import { ref } from "vue";

const username = ref("");
const password = ref("");

const handleSubmit = async () => {
    // 在这里添加验证用户凭据的代码
    console.log("用户名:", username.value);
    console.log("密码:", password.value);

    // 登录成功
    router.push('/dashboard')
};

const login = { username, password, handleSubmit };
</script>

<template>
    <div class="login-wrapper">
        <h2 style="text-align: center;">登录</h2>
        <form @submit.prevent="handleSubmit">
            <div style="margin-top: 1rem;">
                <el-label for="username">用户名:</el-label>
                <el-input type="text" id="username" v-model="username"/>
            </div>
            <div style="margin-top: 1rem;">
                <el-label for="password">密码:</el-label>
                <el-input type="password" id="password" v-model="password"/>
            </div>
            <el-button type="primary" native-type="submit" style="width: 100%; margin-top:1rem;">登录</el-button>
        </form>
        <p style="margin-top: 1rem; color: #727272;">作者：张晓强</p>
  </div>
</template>

<style scoped>
.login-wrapper {
    width: 22rem;
}
</style>