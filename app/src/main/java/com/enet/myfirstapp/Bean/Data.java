package com.enet.myfirstapp.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zhouqiang on 2017/2/13.
 */

public class Data  {
    /**
     * ret : 200
     * data : {"code":0,"msg":"","info":{"default":[{"id":"86","catid":"184","name":"新闻资讯","imagepath":"http://images.enet.com.cn/i/2016/0704/094335669.png"},{"id":"87","catid":"184","name":"记账","imagepath":"http://images.enet.com.cn/i/2016/0704/061538170.png"},{"id":"88","catid":"184","name":"阅读","imagepath":"http://images.enet.com.cn/i/2016/0705/093135398.png"},{"id":"89","catid":"184","name":"输入法","imagepath":"http://images.enet.com.cn/i/2016/0704/093704626.png"},{"id":"90","catid":"184","name":"浏览器","imagepath":"http://images.enet.com.cn/i/2016/0704/083722107.png"},{"id":"91","catid":"184","name":"社区服务","imagepath":"http://images.enet.com.cn/i/2016/0705/094947299.png"},{"id":"93","catid":"184","name":"办公","imagepath":"http://images.enet.com.cn/i/2016/0704/060149474.png"},{"id":"94","catid":"184","name":"女性","imagepath":"http://images.enet.com.cn/i/2016/0704/091451450.png"},{"id":"95","catid":"184","name":"母婴","imagepath":"http://images.enet.com.cn/i/2016/0704/091318195.png"},{"id":"96","catid":"184","name":"外卖","imagepath":"http://images.enet.com.cn/i/2016/0704/094002596.png"},{"id":"98","catid":"184","name":"招聘","imagepath":"http://images.enet.com.cn/i/2016/0704/051947730.png"},{"id":"99","catid":"184","name":"租房买房","imagepath":"http://images.enet.com.cn/i/2016/0705/093516901.png"},{"id":"100","catid":"184","name":"创新","imagepath":"http://images.enet.com.cn/i/2016/0704/060742997.png"},{"id":"101","catid":"184","name":"在线视频","imagepath":"http://images.enet.com.cn/i/2016/0705/093416265.png"},{"id":"102","catid":"184","name":"短视频","imagepath":"http://images.enet.com.cn/i/2016/0704/060949871.png"},{"id":"103","catid":"184","name":"音乐","imagepath":"http://images.enet.com.cn/i/2016/0705/092914746.png"},{"id":"104","catid":"184","name":"K歌","imagepath":"http://images.enet.com.cn/i/2016/0704/055909632.png"},{"id":"105","catid":"184","name":"直播互动","imagepath":"http://images.enet.com.cn/i/2016/0704/061239128.png"},{"id":"106","catid":"184","name":"电台","imagepath":"http://images.enet.com.cn/i/2016/0704/061011869.png"},{"id":"107","catid":"184","name":"图像美化","imagepath":"http://images.enet.com.cn/i/2016/0704/093942258.png"},{"id":"108","catid":"184","name":"相机","imagepath":"http://images.enet.com.cn/i/2016/0704/094101815.png"},{"id":"109","catid":"184","name":"图片分享","imagepath":"http://images.enet.com.cn/i/2016/0704/093913240.png"},{"id":"111","catid":"184","name":"财经","imagepath":"http://images.enet.com.cn/i/2016/0704/060212957.png"},{"id":"112","catid":"184","name":"小工具","imagepath":"http://images.enet.com.cn/i/2016/0704/094135710.png"},{"id":"113","catid":"184","name":"地图导航","imagepath":"http://images.enet.com.cn/i/2016/0704/060830324.png"},{"id":"116","catid":"184","name":"交通票务","imagepath":"http://images.enet.com.cn/i/2016/0704/080139762.png"},{"id":"117","catid":"184","name":"旅游综合服务","imagepath":"http://images.enet.com.cn/i/2016/0704/091152846.png"},{"id":"118","catid":"184","name":"生鲜","imagepath":"http://images.enet.com.cn/i/2016/0704/093605834.png"},{"id":"119","catid":"184","name":"女性导购","imagepath":"http://images.enet.com.cn/i/2016/0704/091508693.png"},{"id":"120","catid":"184","name":"微店","imagepath":"http://images.enet.com.cn/i/2016/0705/013646586.png"},{"id":"121","catid":"184","name":"导购","imagepath":"http://images.enet.com.cn/i/2016/0704/060805229.png"},{"id":"122","catid":"184","name":"母婴电商","imagepath":"http://images.enet.com.cn/i/2016/0704/091337807.png"},{"id":"123","catid":"184","name":"体育","imagepath":"http://images.enet.com.cn/i/2016/0704/093730487.png"},{"id":"125","catid":"184","name":"运动","imagepath":"http://images.enet.com.cn/i/2016/0705/093322587.png"},{"id":"126","catid":"184","name":"婚恋","imagepath":"http://images.enet.com.cn/i/2016/0704/061335595.png"},{"id":"129","catid":"184","name":"医疗","imagepath":"http://images.enet.com.cn/i/2016/0705/092640746.png"},{"id":"130","catid":"184","name":"城市出行","imagepath":"http://images.enet.com.cn/i/2016/0704/060406882.png"},{"id":"131","catid":"184","name":"二手车","imagepath":"http://images.enet.com.cn/i/2016/0704/061118266.png"},{"id":"132","catid":"184","name":"教育","imagepath":"http://images.enet.com.cn/i/2016/0704/080609233.png"},{"id":"135","catid":"184","name":"家装","imagepath":"http://images.enet.com.cn/i/2016/0704/075938355.png"},{"id":"136","catid":"184","name":"家居","imagepath":"http://images.enet.com.cn/i/2016/0704/061911590.png"},{"id":"137","catid":"184","name":"心理咨询","imagepath":"http://images.enet.com.cn/i/2016/0704/094240911.png"},{"id":"138","catid":"184","name":"物流平台信息","imagepath":"http://images.enet.com.cn/i/2016/0704/094029174.png"},{"id":"139","catid":"184","name":"应用市场","imagepath":"http://images.enet.com.cn/i/2016/0705/093042933.png"},{"id":"140","catid":"184","name":"餐饮","imagepath":"http://images.enet.com.cn/i/2016/0704/060252543.png"},{"id":"150","catid":"184","name":"阅读类","imagepath":"http://images.enet.com.cn/i/2016/0705/093150224.png"},{"id":"152","catid":"184","name":"汽车","imagepath":"http://images.enet.com.cn/i/2016/0704/093354342.png"},{"id":"153","catid":"184","name":"互联网金融","imagepath":"http://images.enet.com.cn/i/2016/0704/061258242.png"},{"id":"154","catid":"184","name":"健康（包含减肥）","imagepath":"http://images.enet.com.cn/i/2016/0704/080008404.png"},{"id":"155","catid":"184","name":"跨境电商","imagepath":"http://images.enet.com.cn/i/2016/0704/083210525.png"},{"id":"157","catid":"184","name":"懒人应用","imagepath":"http://images.enet.com.cn/i/2016/0704/083323494.png"},{"id":"158","catid":"184","name":"实用小工具","imagepath":"http://images.enet.com.cn/i/2016/0704/093639736.png"},{"id":"159","catid":"184","name":"AR/VR","imagepath":"http://images.enet.com.cn/i/2016/0704/055814828.png"},{"id":"160","catid":"184","name":"安全优化","imagepath":"http://images.enet.com.cn/i/2016/0704/060129201.png"},{"id":"161","catid":"184","name":"电话通讯","imagepath":"http://images.enet.com.cn/i/2016/0704/060848361.png"},{"id":"162","catid":"184","name":"移动CRM","imagepath":"http://images.enet.com.cn/i/2016/0705/092840401.png"},{"id":"163","catid":"184","name":"企业协同工作","imagepath":"http://images.enet.com.cn/i/2016/0704/093327786.png"},{"id":"164","catid":"184","name":"二次元","imagepath":"http://images.enet.com.cn/i/2016/0704/061056859.png"},{"id":"166","catid":"184","name":"企业社交","imagepath":"http://images.enet.com.cn/i/2016/0705/030850183.png"},{"id":"167","catid":"184","name":"财务软件","imagepath":"http://images.enet.com.cn/i/2016/0704/060232906.png"},{"id":"168","catid":"184","name":"B2B电商","imagepath":"http://images.enet.com.cn/i/2016/0704/055841251.png"},{"id":"169","catid":"184","name":"美妆","imagepath":"http://images.enet.com.cn/i/2016/0704/091222788.png"},{"id":"170","catid":"184","name":"儿童教育","imagepath":"http://images.enet.com.cn/i/2016/0704/061034152.png"},{"id":"171","catid":"184","name":"家电维修","imagepath":"http://images.enet.com.cn/i/2016/0704/061834171.png"},{"id":"173","catid":"184","name":"快递","imagepath":"http://images.enet.com.cn/i/2016/0704/083250431.png"},{"id":"174","catid":"184","name":"货运搬家","imagepath":"http://images.enet.com.cn/i/2016/0704/061421141.png"},{"id":"175","catid":"184","name":"学生必备","imagepath":"http://images.enet.com.cn/i/2016/0705/092234880.png"},{"id":"176","catid":"184","name":"小清新","imagepath":"http://images.enet.com.cn/i/2016/0704/094215800.png"}],"news":[{"id":"141","catid":"185","name":"潮女","imagepath":"http://images.enet.com.cn/i/2016/0705/100343632.png"},{"id":"142","catid":"185","name":"艺术","imagepath":"http://images.enet.com.cn/i/2016/0704/054057538.png"},{"id":"143","catid":"185","name":"经济分享","imagepath":"http://images.enet.com.cn/i/2016/0705/100420259.png"},{"id":"145","catid":"185","name":"干性","imagepath":"http://images.enet.com.cn/i/2016/0705/093709256.png"},{"id":"146","catid":"185","name":"湿性","imagepath":"http://images.enet.com.cn/i/2016/0704/054027714.png"},{"id":"147","catid":"185","name":"趣享","imagepath":"http://images.enet.com.cn/i/2016/0705/115235912.png"},{"id":"148","catid":"185","name":"潮男","imagepath":"http://images.enet.com.cn/i/2016/0705/100437380.png"},{"id":"172","catid":"185","name":"新生活方式","imagepath":"http://images.enet.com.cn/i/2016/0705/115216356.png"}],"carousel":[{"id":"145","name":"干性","imagepath":"http://images.enet.com.cn/i/2016/0704/052343507.jpg","model":"list","iosurl":"","downloadurl":""},{"id":"142","name":"艺术","imagepath":"http://images.enet.com.cn/i/2016/0704/054252687.jpg","model":"list","iosurl":"","downloadurl":""},{"id":"146","name":"湿性","imagepath":"http://images.enet.com.cn/i/2016/0704/052505974.jpg","model":"list","iosurl":"","downloadurl":""}]}}
     * msg :
     */

    private int ret;
    private DataEntity data;
    private String msg;

    public void setRet(int ret) {
        this.ret = ret;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getRet() {
        return ret;
    }

    public DataEntity getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public static class DataEntity {
        /**
         * code : 0
         * msg :
         * info : {"default":[{"id":"86","catid":"184","name":"新闻资讯","imagepath":"http://images.enet.com.cn/i/2016/0704/094335669.png"},{"id":"87","catid":"184","name":"记账","imagepath":"http://images.enet.com.cn/i/2016/0704/061538170.png"},{"id":"88","catid":"184","name":"阅读","imagepath":"http://images.enet.com.cn/i/2016/0705/093135398.png"},{"id":"89","catid":"184","name":"输入法","imagepath":"http://images.enet.com.cn/i/2016/0704/093704626.png"},{"id":"90","catid":"184","name":"浏览器","imagepath":"http://images.enet.com.cn/i/2016/0704/083722107.png"},{"id":"91","catid":"184","name":"社区服务","imagepath":"http://images.enet.com.cn/i/2016/0705/094947299.png"},{"id":"93","catid":"184","name":"办公","imagepath":"http://images.enet.com.cn/i/2016/0704/060149474.png"},{"id":"94","catid":"184","name":"女性","imagepath":"http://images.enet.com.cn/i/2016/0704/091451450.png"},{"id":"95","catid":"184","name":"母婴","imagepath":"http://images.enet.com.cn/i/2016/0704/091318195.png"},{"id":"96","catid":"184","name":"外卖","imagepath":"http://images.enet.com.cn/i/2016/0704/094002596.png"},{"id":"98","catid":"184","name":"招聘","imagepath":"http://images.enet.com.cn/i/2016/0704/051947730.png"},{"id":"99","catid":"184","name":"租房买房","imagepath":"http://images.enet.com.cn/i/2016/0705/093516901.png"},{"id":"100","catid":"184","name":"创新","imagepath":"http://images.enet.com.cn/i/2016/0704/060742997.png"},{"id":"101","catid":"184","name":"在线视频","imagepath":"http://images.enet.com.cn/i/2016/0705/093416265.png"},{"id":"102","catid":"184","name":"短视频","imagepath":"http://images.enet.com.cn/i/2016/0704/060949871.png"},{"id":"103","catid":"184","name":"音乐","imagepath":"http://images.enet.com.cn/i/2016/0705/092914746.png"},{"id":"104","catid":"184","name":"K歌","imagepath":"http://images.enet.com.cn/i/2016/0704/055909632.png"},{"id":"105","catid":"184","name":"直播互动","imagepath":"http://images.enet.com.cn/i/2016/0704/061239128.png"},{"id":"106","catid":"184","name":"电台","imagepath":"http://images.enet.com.cn/i/2016/0704/061011869.png"},{"id":"107","catid":"184","name":"图像美化","imagepath":"http://images.enet.com.cn/i/2016/0704/093942258.png"},{"id":"108","catid":"184","name":"相机","imagepath":"http://images.enet.com.cn/i/2016/0704/094101815.png"},{"id":"109","catid":"184","name":"图片分享","imagepath":"http://images.enet.com.cn/i/2016/0704/093913240.png"},{"id":"111","catid":"184","name":"财经","imagepath":"http://images.enet.com.cn/i/2016/0704/060212957.png"},{"id":"112","catid":"184","name":"小工具","imagepath":"http://images.enet.com.cn/i/2016/0704/094135710.png"},{"id":"113","catid":"184","name":"地图导航","imagepath":"http://images.enet.com.cn/i/2016/0704/060830324.png"},{"id":"116","catid":"184","name":"交通票务","imagepath":"http://images.enet.com.cn/i/2016/0704/080139762.png"},{"id":"117","catid":"184","name":"旅游综合服务","imagepath":"http://images.enet.com.cn/i/2016/0704/091152846.png"},{"id":"118","catid":"184","name":"生鲜","imagepath":"http://images.enet.com.cn/i/2016/0704/093605834.png"},{"id":"119","catid":"184","name":"女性导购","imagepath":"http://images.enet.com.cn/i/2016/0704/091508693.png"},{"id":"120","catid":"184","name":"微店","imagepath":"http://images.enet.com.cn/i/2016/0705/013646586.png"},{"id":"121","catid":"184","name":"导购","imagepath":"http://images.enet.com.cn/i/2016/0704/060805229.png"},{"id":"122","catid":"184","name":"母婴电商","imagepath":"http://images.enet.com.cn/i/2016/0704/091337807.png"},{"id":"123","catid":"184","name":"体育","imagepath":"http://images.enet.com.cn/i/2016/0704/093730487.png"},{"id":"125","catid":"184","name":"运动","imagepath":"http://images.enet.com.cn/i/2016/0705/093322587.png"},{"id":"126","catid":"184","name":"婚恋","imagepath":"http://images.enet.com.cn/i/2016/0704/061335595.png"},{"id":"129","catid":"184","name":"医疗","imagepath":"http://images.enet.com.cn/i/2016/0705/092640746.png"},{"id":"130","catid":"184","name":"城市出行","imagepath":"http://images.enet.com.cn/i/2016/0704/060406882.png"},{"id":"131","catid":"184","name":"二手车","imagepath":"http://images.enet.com.cn/i/2016/0704/061118266.png"},{"id":"132","catid":"184","name":"教育","imagepath":"http://images.enet.com.cn/i/2016/0704/080609233.png"},{"id":"135","catid":"184","name":"家装","imagepath":"http://images.enet.com.cn/i/2016/0704/075938355.png"},{"id":"136","catid":"184","name":"家居","imagepath":"http://images.enet.com.cn/i/2016/0704/061911590.png"},{"id":"137","catid":"184","name":"心理咨询","imagepath":"http://images.enet.com.cn/i/2016/0704/094240911.png"},{"id":"138","catid":"184","name":"物流平台信息","imagepath":"http://images.enet.com.cn/i/2016/0704/094029174.png"},{"id":"139","catid":"184","name":"应用市场","imagepath":"http://images.enet.com.cn/i/2016/0705/093042933.png"},{"id":"140","catid":"184","name":"餐饮","imagepath":"http://images.enet.com.cn/i/2016/0704/060252543.png"},{"id":"150","catid":"184","name":"阅读类","imagepath":"http://images.enet.com.cn/i/2016/0705/093150224.png"},{"id":"152","catid":"184","name":"汽车","imagepath":"http://images.enet.com.cn/i/2016/0704/093354342.png"},{"id":"153","catid":"184","name":"互联网金融","imagepath":"http://images.enet.com.cn/i/2016/0704/061258242.png"},{"id":"154","catid":"184","name":"健康（包含减肥）","imagepath":"http://images.enet.com.cn/i/2016/0704/080008404.png"},{"id":"155","catid":"184","name":"跨境电商","imagepath":"http://images.enet.com.cn/i/2016/0704/083210525.png"},{"id":"157","catid":"184","name":"懒人应用","imagepath":"http://images.enet.com.cn/i/2016/0704/083323494.png"},{"id":"158","catid":"184","name":"实用小工具","imagepath":"http://images.enet.com.cn/i/2016/0704/093639736.png"},{"id":"159","catid":"184","name":"AR/VR","imagepath":"http://images.enet.com.cn/i/2016/0704/055814828.png"},{"id":"160","catid":"184","name":"安全优化","imagepath":"http://images.enet.com.cn/i/2016/0704/060129201.png"},{"id":"161","catid":"184","name":"电话通讯","imagepath":"http://images.enet.com.cn/i/2016/0704/060848361.png"},{"id":"162","catid":"184","name":"移动CRM","imagepath":"http://images.enet.com.cn/i/2016/0705/092840401.png"},{"id":"163","catid":"184","name":"企业协同工作","imagepath":"http://images.enet.com.cn/i/2016/0704/093327786.png"},{"id":"164","catid":"184","name":"二次元","imagepath":"http://images.enet.com.cn/i/2016/0704/061056859.png"},{"id":"166","catid":"184","name":"企业社交","imagepath":"http://images.enet.com.cn/i/2016/0705/030850183.png"},{"id":"167","catid":"184","name":"财务软件","imagepath":"http://images.enet.com.cn/i/2016/0704/060232906.png"},{"id":"168","catid":"184","name":"B2B电商","imagepath":"http://images.enet.com.cn/i/2016/0704/055841251.png"},{"id":"169","catid":"184","name":"美妆","imagepath":"http://images.enet.com.cn/i/2016/0704/091222788.png"},{"id":"170","catid":"184","name":"儿童教育","imagepath":"http://images.enet.com.cn/i/2016/0704/061034152.png"},{"id":"171","catid":"184","name":"家电维修","imagepath":"http://images.enet.com.cn/i/2016/0704/061834171.png"},{"id":"173","catid":"184","name":"快递","imagepath":"http://images.enet.com.cn/i/2016/0704/083250431.png"},{"id":"174","catid":"184","name":"货运搬家","imagepath":"http://images.enet.com.cn/i/2016/0704/061421141.png"},{"id":"175","catid":"184","name":"学生必备","imagepath":"http://images.enet.com.cn/i/2016/0705/092234880.png"},{"id":"176","catid":"184","name":"小清新","imagepath":"http://images.enet.com.cn/i/2016/0704/094215800.png"}],"news":[{"id":"141","catid":"185","name":"潮女","imagepath":"http://images.enet.com.cn/i/2016/0705/100343632.png"},{"id":"142","catid":"185","name":"艺术","imagepath":"http://images.enet.com.cn/i/2016/0704/054057538.png"},{"id":"143","catid":"185","name":"经济分享","imagepath":"http://images.enet.com.cn/i/2016/0705/100420259.png"},{"id":"145","catid":"185","name":"干性","imagepath":"http://images.enet.com.cn/i/2016/0705/093709256.png"},{"id":"146","catid":"185","name":"湿性","imagepath":"http://images.enet.com.cn/i/2016/0704/054027714.png"},{"id":"147","catid":"185","name":"趣享","imagepath":"http://images.enet.com.cn/i/2016/0705/115235912.png"},{"id":"148","catid":"185","name":"潮男","imagepath":"http://images.enet.com.cn/i/2016/0705/100437380.png"},{"id":"172","catid":"185","name":"新生活方式","imagepath":"http://images.enet.com.cn/i/2016/0705/115216356.png"}],"carousel":[{"id":"145","name":"干性","imagepath":"http://images.enet.com.cn/i/2016/0704/052343507.jpg","model":"list","iosurl":"","downloadurl":""},{"id":"142","name":"艺术","imagepath":"http://images.enet.com.cn/i/2016/0704/054252687.jpg","model":"list","iosurl":"","downloadurl":""},{"id":"146","name":"湿性","imagepath":"http://images.enet.com.cn/i/2016/0704/052505974.jpg","model":"list","iosurl":"","downloadurl":""}]}
         */

        private int code;
        private String msg;
        private InfoEntity info;

        public void setCode(int code) {
            this.code = code;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public void setInfo(InfoEntity info) {
            this.info = info;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }

        public InfoEntity getInfo() {
            return info;
        }

        public static class InfoEntity {
            /**
             * default : [{"id":"86","catid":"184","name":"新闻资讯","imagepath":"http://images.enet.com.cn/i/2016/0704/094335669.png"},{"id":"87","catid":"184","name":"记账","imagepath":"http://images.enet.com.cn/i/2016/0704/061538170.png"},{"id":"88","catid":"184","name":"阅读","imagepath":"http://images.enet.com.cn/i/2016/0705/093135398.png"},{"id":"89","catid":"184","name":"输入法","imagepath":"http://images.enet.com.cn/i/2016/0704/093704626.png"},{"id":"90","catid":"184","name":"浏览器","imagepath":"http://images.enet.com.cn/i/2016/0704/083722107.png"},{"id":"91","catid":"184","name":"社区服务","imagepath":"http://images.enet.com.cn/i/2016/0705/094947299.png"},{"id":"93","catid":"184","name":"办公","imagepath":"http://images.enet.com.cn/i/2016/0704/060149474.png"},{"id":"94","catid":"184","name":"女性","imagepath":"http://images.enet.com.cn/i/2016/0704/091451450.png"},{"id":"95","catid":"184","name":"母婴","imagepath":"http://images.enet.com.cn/i/2016/0704/091318195.png"},{"id":"96","catid":"184","name":"外卖","imagepath":"http://images.enet.com.cn/i/2016/0704/094002596.png"},{"id":"98","catid":"184","name":"招聘","imagepath":"http://images.enet.com.cn/i/2016/0704/051947730.png"},{"id":"99","catid":"184","name":"租房买房","imagepath":"http://images.enet.com.cn/i/2016/0705/093516901.png"},{"id":"100","catid":"184","name":"创新","imagepath":"http://images.enet.com.cn/i/2016/0704/060742997.png"},{"id":"101","catid":"184","name":"在线视频","imagepath":"http://images.enet.com.cn/i/2016/0705/093416265.png"},{"id":"102","catid":"184","name":"短视频","imagepath":"http://images.enet.com.cn/i/2016/0704/060949871.png"},{"id":"103","catid":"184","name":"音乐","imagepath":"http://images.enet.com.cn/i/2016/0705/092914746.png"},{"id":"104","catid":"184","name":"K歌","imagepath":"http://images.enet.com.cn/i/2016/0704/055909632.png"},{"id":"105","catid":"184","name":"直播互动","imagepath":"http://images.enet.com.cn/i/2016/0704/061239128.png"},{"id":"106","catid":"184","name":"电台","imagepath":"http://images.enet.com.cn/i/2016/0704/061011869.png"},{"id":"107","catid":"184","name":"图像美化","imagepath":"http://images.enet.com.cn/i/2016/0704/093942258.png"},{"id":"108","catid":"184","name":"相机","imagepath":"http://images.enet.com.cn/i/2016/0704/094101815.png"},{"id":"109","catid":"184","name":"图片分享","imagepath":"http://images.enet.com.cn/i/2016/0704/093913240.png"},{"id":"111","catid":"184","name":"财经","imagepath":"http://images.enet.com.cn/i/2016/0704/060212957.png"},{"id":"112","catid":"184","name":"小工具","imagepath":"http://images.enet.com.cn/i/2016/0704/094135710.png"},{"id":"113","catid":"184","name":"地图导航","imagepath":"http://images.enet.com.cn/i/2016/0704/060830324.png"},{"id":"116","catid":"184","name":"交通票务","imagepath":"http://images.enet.com.cn/i/2016/0704/080139762.png"},{"id":"117","catid":"184","name":"旅游综合服务","imagepath":"http://images.enet.com.cn/i/2016/0704/091152846.png"},{"id":"118","catid":"184","name":"生鲜","imagepath":"http://images.enet.com.cn/i/2016/0704/093605834.png"},{"id":"119","catid":"184","name":"女性导购","imagepath":"http://images.enet.com.cn/i/2016/0704/091508693.png"},{"id":"120","catid":"184","name":"微店","imagepath":"http://images.enet.com.cn/i/2016/0705/013646586.png"},{"id":"121","catid":"184","name":"导购","imagepath":"http://images.enet.com.cn/i/2016/0704/060805229.png"},{"id":"122","catid":"184","name":"母婴电商","imagepath":"http://images.enet.com.cn/i/2016/0704/091337807.png"},{"id":"123","catid":"184","name":"体育","imagepath":"http://images.enet.com.cn/i/2016/0704/093730487.png"},{"id":"125","catid":"184","name":"运动","imagepath":"http://images.enet.com.cn/i/2016/0705/093322587.png"},{"id":"126","catid":"184","name":"婚恋","imagepath":"http://images.enet.com.cn/i/2016/0704/061335595.png"},{"id":"129","catid":"184","name":"医疗","imagepath":"http://images.enet.com.cn/i/2016/0705/092640746.png"},{"id":"130","catid":"184","name":"城市出行","imagepath":"http://images.enet.com.cn/i/2016/0704/060406882.png"},{"id":"131","catid":"184","name":"二手车","imagepath":"http://images.enet.com.cn/i/2016/0704/061118266.png"},{"id":"132","catid":"184","name":"教育","imagepath":"http://images.enet.com.cn/i/2016/0704/080609233.png"},{"id":"135","catid":"184","name":"家装","imagepath":"http://images.enet.com.cn/i/2016/0704/075938355.png"},{"id":"136","catid":"184","name":"家居","imagepath":"http://images.enet.com.cn/i/2016/0704/061911590.png"},{"id":"137","catid":"184","name":"心理咨询","imagepath":"http://images.enet.com.cn/i/2016/0704/094240911.png"},{"id":"138","catid":"184","name":"物流平台信息","imagepath":"http://images.enet.com.cn/i/2016/0704/094029174.png"},{"id":"139","catid":"184","name":"应用市场","imagepath":"http://images.enet.com.cn/i/2016/0705/093042933.png"},{"id":"140","catid":"184","name":"餐饮","imagepath":"http://images.enet.com.cn/i/2016/0704/060252543.png"},{"id":"150","catid":"184","name":"阅读类","imagepath":"http://images.enet.com.cn/i/2016/0705/093150224.png"},{"id":"152","catid":"184","name":"汽车","imagepath":"http://images.enet.com.cn/i/2016/0704/093354342.png"},{"id":"153","catid":"184","name":"互联网金融","imagepath":"http://images.enet.com.cn/i/2016/0704/061258242.png"},{"id":"154","catid":"184","name":"健康（包含减肥）","imagepath":"http://images.enet.com.cn/i/2016/0704/080008404.png"},{"id":"155","catid":"184","name":"跨境电商","imagepath":"http://images.enet.com.cn/i/2016/0704/083210525.png"},{"id":"157","catid":"184","name":"懒人应用","imagepath":"http://images.enet.com.cn/i/2016/0704/083323494.png"},{"id":"158","catid":"184","name":"实用小工具","imagepath":"http://images.enet.com.cn/i/2016/0704/093639736.png"},{"id":"159","catid":"184","name":"AR/VR","imagepath":"http://images.enet.com.cn/i/2016/0704/055814828.png"},{"id":"160","catid":"184","name":"安全优化","imagepath":"http://images.enet.com.cn/i/2016/0704/060129201.png"},{"id":"161","catid":"184","name":"电话通讯","imagepath":"http://images.enet.com.cn/i/2016/0704/060848361.png"},{"id":"162","catid":"184","name":"移动CRM","imagepath":"http://images.enet.com.cn/i/2016/0705/092840401.png"},{"id":"163","catid":"184","name":"企业协同工作","imagepath":"http://images.enet.com.cn/i/2016/0704/093327786.png"},{"id":"164","catid":"184","name":"二次元","imagepath":"http://images.enet.com.cn/i/2016/0704/061056859.png"},{"id":"166","catid":"184","name":"企业社交","imagepath":"http://images.enet.com.cn/i/2016/0705/030850183.png"},{"id":"167","catid":"184","name":"财务软件","imagepath":"http://images.enet.com.cn/i/2016/0704/060232906.png"},{"id":"168","catid":"184","name":"B2B电商","imagepath":"http://images.enet.com.cn/i/2016/0704/055841251.png"},{"id":"169","catid":"184","name":"美妆","imagepath":"http://images.enet.com.cn/i/2016/0704/091222788.png"},{"id":"170","catid":"184","name":"儿童教育","imagepath":"http://images.enet.com.cn/i/2016/0704/061034152.png"},{"id":"171","catid":"184","name":"家电维修","imagepath":"http://images.enet.com.cn/i/2016/0704/061834171.png"},{"id":"173","catid":"184","name":"快递","imagepath":"http://images.enet.com.cn/i/2016/0704/083250431.png"},{"id":"174","catid":"184","name":"货运搬家","imagepath":"http://images.enet.com.cn/i/2016/0704/061421141.png"},{"id":"175","catid":"184","name":"学生必备","imagepath":"http://images.enet.com.cn/i/2016/0705/092234880.png"},{"id":"176","catid":"184","name":"小清新","imagepath":"http://images.enet.com.cn/i/2016/0704/094215800.png"}]
             * news : [{"id":"141","catid":"185","name":"潮女","imagepath":"http://images.enet.com.cn/i/2016/0705/100343632.png"},{"id":"142","catid":"185","name":"艺术","imagepath":"http://images.enet.com.cn/i/2016/0704/054057538.png"},{"id":"143","catid":"185","name":"经济分享","imagepath":"http://images.enet.com.cn/i/2016/0705/100420259.png"},{"id":"145","catid":"185","name":"干性","imagepath":"http://images.enet.com.cn/i/2016/0705/093709256.png"},{"id":"146","catid":"185","name":"湿性","imagepath":"http://images.enet.com.cn/i/2016/0704/054027714.png"},{"id":"147","catid":"185","name":"趣享","imagepath":"http://images.enet.com.cn/i/2016/0705/115235912.png"},{"id":"148","catid":"185","name":"潮男","imagepath":"http://images.enet.com.cn/i/2016/0705/100437380.png"},{"id":"172","catid":"185","name":"新生活方式","imagepath":"http://images.enet.com.cn/i/2016/0705/115216356.png"}]
             * carousel : [{"id":"145","name":"干性","imagepath":"http://images.enet.com.cn/i/2016/0704/052343507.jpg","model":"list","iosurl":"","downloadurl":""},{"id":"142","name":"艺术","imagepath":"http://images.enet.com.cn/i/2016/0704/054252687.jpg","model":"list","iosurl":"","downloadurl":""},{"id":"146","name":"湿性","imagepath":"http://images.enet.com.cn/i/2016/0704/052505974.jpg","model":"list","iosurl":"","downloadurl":""}]
             */

            @SerializedName("default")
            private List<DefaultEntity> defaultX;
            private List<NewsEntity> news;
            private List<CarouselEntity> carousel;

            public void setDefaultX(List<DefaultEntity> defaultX) {
                this.defaultX = defaultX;
            }

            public void setNews(List<NewsEntity> news) {
                this.news = news;
            }

            public void setCarousel(List<CarouselEntity> carousel) {
                this.carousel = carousel;
            }

            public List<DefaultEntity> getDefaultX() {
                return defaultX;
            }

            public List<NewsEntity> getNews() {
                return news;
            }

            public List<CarouselEntity> getCarousel() {
                return carousel;
            }

            public static class DefaultEntity {
                /**
                 * id : 86
                 * catid : 184
                 * name : 新闻资讯
                 * imagepath : http://images.enet.com.cn/i/2016/0704/094335669.png
                 */

                private String id;
                private String catid;
                private String name;
                private String imagepath;

                public void setId(String id) {
                    this.id = id;
                }

                public void setCatid(String catid) {
                    this.catid = catid;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setImagepath(String imagepath) {
                    this.imagepath = imagepath;
                }

                public String getId() {
                    return id;
                }

                public String getCatid() {
                    return catid;
                }

                public String getName() {
                    return name;
                }

                public String getImagepath() {
                    return imagepath;
                }
            }

            public static class NewsEntity {
                /**
                 * id : 141
                 * catid : 185
                 * name : 潮女
                 * imagepath : http://images.enet.com.cn/i/2016/0705/100343632.png
                 */

                private String id;
                private String catid;
                private String name;
                private String imagepath;

                public void setId(String id) {
                    this.id = id;
                }

                public void setCatid(String catid) {
                    this.catid = catid;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setImagepath(String imagepath) {
                    this.imagepath = imagepath;
                }

                public String getId() {
                    return id;
                }

                public String getCatid() {
                    return catid;
                }

                public String getName() {
                    return name;
                }

                public String getImagepath() {
                    return imagepath;
                }
            }

            public static class CarouselEntity {
                /**
                 * id : 145
                 * name : 干性
                 * imagepath : http://images.enet.com.cn/i/2016/0704/052343507.jpg
                 * model : list
                 * iosurl :
                 * downloadurl :
                 */

                private String id;
                private String name;
                private String imagepath;
                private String model;
                private String iosurl;
                private String downloadurl;

                public void setId(String id) {
                    this.id = id;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setImagepath(String imagepath) {
                    this.imagepath = imagepath;
                }

                public void setModel(String model) {
                    this.model = model;
                }

                public void setIosurl(String iosurl) {
                    this.iosurl = iosurl;
                }

                public void setDownloadurl(String downloadurl) {
                    this.downloadurl = downloadurl;
                }

                public String getId() {
                    return id;
                }

                public String getName() {
                    return name;
                }

                public String getImagepath() {
                    return imagepath;
                }

                public String getModel() {
                    return model;
                }

                public String getIosurl() {
                    return iosurl;
                }

                public String getDownloadurl() {
                    return downloadurl;
                }
            }
        }
    }
}
