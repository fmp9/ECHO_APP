<template>
  <div>
    <router-view></router-view>
  </div>
</template>

<script setup>

</script>

<style lang="scss">
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
html, body{
  height: 100%;
  width: 100%;
  overflow: hidden;
  background-color: var(--main-col);
  color: var(--text-col);
  font-family: 'Poppins', sans-serif;
  font-size: 18px;
  padding: var(--margin-sm-md) var(--margin-lg);
}

</style>