<template>
  <div>
    <div class="burger" @click="toggleMenu">
      <span class="line"></span>
      <span class="line"></span>
      <span class="line"></span>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const isOpen = ref(false)

function toggleMenu() {
  isOpen.value = !isOpen.value
}

</script>

<style lang="scss" scoped>
.burger {
  position: fixed;
  top: var(--margin-lg);
  right: var(--margin-l);
  width: 2rem;
  height: 2rem;
  display: flex;
  flex-direction: column;
  justify-content: center;
  gap: 0.3rem;
  cursor: pointer;
  z-index: 1001;
  .line {
    width: 100%;
    height: .2rem;
    background-color: var(--text-color);
    border-radius: 999px;
  }
}


</style>
