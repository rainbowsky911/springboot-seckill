package cn.tycoding.vo;

import cn.tycoding.entity.Seckill;
import cn.tycoding.entity.SeckillOrder;
import lombok.Data;


/**
 *  秒杀订单视图类
 * @author 51473
 */
@Data
public class SeckillOrderVO  extends SeckillOrder {


    /**
     * 一对一对象
     */
    private Seckill seckill;

}
