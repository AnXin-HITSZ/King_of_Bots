import { AcGameObject } from "./AcGameObject";

export class Wall extends AcGameObject {
    constructor(r, c, gamemap) {
        super();    // 调用父类构造函数，自动注册到 AC_GAME_OBJECTS 数组

        this.r = r; // 行坐标（row）
        this.c = c; // 列坐标（column）
        this.gamemap = gamemap; // 对游戏地图的引用
        this.color = "#B37226"; // 墙的颜色（棕色）
    }

    update() {
        this.render();  // 每帧都调用渲染方法
    }

    render() {
        const L = this.gamemap.L;   // 获取每个网格单元的边长（像素）
        const ctx = this.gamemap.ctx;   // 获取 Canvas 绘图上下文

        ctx.fillStyle = this.color; // 设置填充颜色为墙的颜色
        ctx.fillRect(this.c * L, this.r * L, L, L); // 绘制矩形墙块
    }
}