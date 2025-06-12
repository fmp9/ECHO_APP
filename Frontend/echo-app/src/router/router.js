import { createRouter, createWebHistory } from 'vue-router';

const routes = [
    {
        path: '/',
        name: 'Home',
        component: () => import('../views/HomeView.vue'),
    },{
        path: '/community',
        name: 'Community',
        component: () => import('../views/CommunityView.vue'),
    },{
        path: '/history',
        name: 'History',
        component: () => import('../views/HistoryView.vue'),
    }
]

export const router = createRouter({
    history: createWebHistory(),
    routes,
});