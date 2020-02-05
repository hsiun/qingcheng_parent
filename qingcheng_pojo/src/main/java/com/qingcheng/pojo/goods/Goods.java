package com.qingcheng.pojo.goods;

import java.io.Serializable;
import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2020-01-22 11:49
 */

public class Goods implements Serializable {
    private Spu spu;
    private List<Sku> skuList;

    public Spu getSpu() {
        return spu;
    }

    public void setSpu(Spu spu) {
        this.spu = spu;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }
}
