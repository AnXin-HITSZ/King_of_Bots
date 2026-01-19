package com.kob.backend.consumer.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: Player
 * Package: com.kob.backend.consumer.utils
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/18 17:31
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private Integer id;
    private Integer sx;
    private Integer sy;
    private List<Integer> steps;
}
