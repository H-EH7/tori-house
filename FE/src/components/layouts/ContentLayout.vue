<template>
    <div class="overflow-y-hidden">
        <div class="d-flex h-100 m-0">
            <RouterView />
        </div>
    </div>
</template>

<style scoped></style>

<script setup>
    import { RouterView } from "vue-router";
</script>
