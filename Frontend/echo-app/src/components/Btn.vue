<template>
  <div class="btn-container">
    <button class="btn"> {{ btnContent }} </button>
  </div>
</template>

<script setup>
import { defineProps } from 'vue'
defineProps(['btnContent'])
</script>

<style lang="scss" scoped>
button{
  color: var(--main-color);
  background-color: var(--highlight-color);
  font-family: 'Poppins', sans-serif;
  border-radius: 999px;
  font-size: 18px;
  font-weight: 600;
  padding: var(--margin-ml) var(--margin-xl);
}
</style>