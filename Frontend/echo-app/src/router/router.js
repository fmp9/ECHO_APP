import { createMemoryHistory, createRouter } from 'vue-router'
import HomeView from "../views/HomeView.vue";
import HistoryView from "../views/HistoryView.vue";
import CommunityView from "../views/CommunityView.vue";

const routes = [
    { path: '/', component: HomeView },
    { path: '/history', component: HistoryView},
    { path: '/community', component: CommunityView}
]

const router = createRouter({
    history: createMemoryHistory(),
    routes
})

export default router;