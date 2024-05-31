<template>
    <div id="editor-menu" class="container">
        <div class="card">
            <h5 class="card-title">Card Title</h5>
            <label for="title" class="form-label">title</label>
            <input type="text" class="form-control" id="title">
        </div>
    </div>
</template>

<style scoped>
    #editor-menu {
        overflow: auto;
        min-width: 440px;
        max-width: 440px;
        background-color: var(--color-bg-editor);
    }

    .card {
        margin: 1rem;
        padding: 1rem;
    }
</style>
