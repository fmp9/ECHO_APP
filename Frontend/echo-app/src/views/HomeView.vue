<template>
  <div class="home-container">
    <div class="emotion-query-container">
      <h1>How would you describe your <span style="color: var(--highlight-color)"> mood right</span> now?</h1>
      <div class="emotions-card-wrapper"></div>
      <Btn btnContent="Next"></Btn>
    </div>
  </div>
</template>

<script setup>
import Btn from "../components/Btn.vue";

</script>

<style lang="scss" scoped>
.home-container {
  position: relative;
  width: 100vw;
  height: 100vh;
  .emotion-query-container{
    position: fixed;
    width: 100%;
    height: 100%;
  }
}
</style>