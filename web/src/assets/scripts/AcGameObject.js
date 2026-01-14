const AC_GAME_OBJECTS = []; // 全局游戏对象数组

/* 游戏对象基类 */
export class AcGameObject {
    constructor() {
        AC_GAME_OBJECTS.push(this); // 自动注册到全局数组
        this.timedelta = 0; // 帧时间间隔（毫秒）
        this.has_called_start = false;  // 标记 start 是否已执行
    }

    start () {  // 只执行一次
    }

    update() {  // 每一帧执行一次，除了第一帧之外

    }

    on_destroy() {  // 删除之前执行

    }

    destroy() {
        this.on_destroy();  // 先执行清理回调

        // 从全局数组中移除自己
        for (let i in AC_GAME_OBJECTS) {
            const obj = AC_GAME_OBJECTS[i];
            if (obj === this) {
                AC_GAME_OBJECTS.splice(i);  // 从索引 i 开始，删除数组中从该位置到末尾的所有元素
            }
        }
    }
}

let last_timestamp; // 上一次执行的时刻
/* 游戏主循环 step 函数 */
const step = timestamp => {
    // 遍历所有游戏对象
    for (let obj of AC_GAME_OBJECTS) {
        if (!obj.has_called_start) {
            // 第一次执行：调用 start()
            obj.has_called_start = true;
            obj.start();
        } else {
            // 后续执行：计算时间差，调用 update()
            obj.timedelta = timestamp - last_timestamp;
            obj.update();
        }
    }

    // 更新时间戳，请求下一帧
    last_timestamp = timestamp;
    requestAnimationFrame(step)
}

requestAnimationFrame(step)