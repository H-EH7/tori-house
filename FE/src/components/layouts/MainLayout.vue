<template>
    <div id="main-layout">
        <nav class="navbar navbar-expand-md bg-white border-bottom border-2" style="flex-grow: 1">
            <div class="container-fluid">
                <RouterLink to="/" class="navbar-brand border-end border-2 pe-4 fs-5 fw-bold ms-3">Tori House</RouterLink>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-between" id="navbarSupportedContent">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <RouterLink to="/editor" class="nav-link">청첩장 만들기</RouterLink>
                        </li>
                    </ul>
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <RouterLink to="/" class="nav-link">MyPage</RouterLink>
                        </li>
                        <li class="nav-item">
                            <RouterLink to="/" class="nav-link">Login</RouterLink>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <ContentLayout />
    </div>
</template>

<style scoped>
    #main-layout {
        display: flex;
        flex-direction: column;
        height: 100vh;
    }

    .navbar-brand {
        font-family: "Jua", sans-serif;
    }
</style>

<script setup>
    import ContentLayout from "@/components/layouts/ContentLayout.vue";

    import { RouterLink } from "vue-router";
</script>
