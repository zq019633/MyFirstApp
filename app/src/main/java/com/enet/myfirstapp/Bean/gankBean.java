package com.enet.myfirstapp.Bean;

import java.util.List; /**
 * Created by zhouqiang on 2017/2/14.
 */

public class gankBean {


    /**
     * error : false
     * results : [{"_id":"58a2780e421aa901f7902c7d","createdAt":"2017-02-14T11:22:54.87Z","desc":"Material Design 风格的 About 页面","images":["http://img.gank.io/1b5d9fb5-689c-4f5c-a33c-c2a9323ac87d","http://img.gank.io/aaa8a306-3124-4197-ad4e-ff3deec459c8"],"publishedAt":"2017-02-14T11:42:37.303Z","source":"chrome","type":"Android","url":"https://github.com/jrvansuita/MaterialAbout","used":true,"who":"代码家"},{"_id":"58a27845421aa901f7902c7e","createdAt":"2017-02-14T11:23:49.435Z","desc":"Android 运行时主题切换小工具库","images":["http://img.gank.io/a0976d17-8434-42fd-a438-3953046924d0","http://img.gank.io/f5f1ea06-3c07-4174-863d-bd9f56fa1317"],"publishedAt":"2017-02-14T11:42:37.303Z","source":"chrome","type":"Android","url":"https://github.com/garretyoder/Colorful","used":true,"who":"代码家"},{"_id":"58a279a6421aa901f7902c7f","createdAt":"2017-02-14T11:29:42.995Z","desc":"用注解的方式，为 Android 加上桌面长按快捷方式，超实用哦。","images":["http://img.gank.io/652f9aa3-0208-4319-a44f-4c86031b8c1e"],"publishedAt":"2017-02-14T11:42:37.303Z","source":"chrome","type":"Android","url":"https://github.com/MatthiasRobbers/shortbread","used":true,"who":"MR"},{"_id":"58a279b9421aa901f56d368e","createdAt":"2017-02-14T11:30:01.696Z","desc":"接手老项目，难免遇到前辈的硬编码,怎么办？利用工具剔除出来啊","publishedAt":"2017-02-14T11:42:37.303Z","source":"web","type":"Android","url":"https://github.com/Kutear/Fuck-Hard-Code","used":true,"who":"KuTear"},{"_id":"589ece26421aa92710db961a","createdAt":"2017-02-11T16:41:10.3Z","desc":"关于Android应用的耗电量的统计分析方法和工具","images":["http://img.gank.io/f43faa62-8c4a-4eba-9c67-2142539dc2a5","http://img.gank.io/bee4090a-26cb-4917-ad3f-e2a9b485f140"],"publishedAt":"2017-02-13T11:54:17.922Z","source":"web","type":"Android","url":"https://hujiaweibujidao.github.io/blog/2017/01/24/how-to-know-your-applications-battery-stats/","used":true,"who":"潇涧"},{"_id":"58a00b79421aa901ef405786","createdAt":"2017-02-12T15:15:05.362Z","desc":"一款优雅的遵循 Material Design 的开源音乐播放器","images":["http://img.gank.io/9af611e5-7eb0-4c03-97ed-1798fba0019e","http://img.gank.io/69dd5400-56bf-4455-b3ab-23912cdfb230"],"publishedAt":"2017-02-13T11:54:17.922Z","source":"chrome","type":"Android","url":"https://github.com/hefuyicoder/ListenerMusicPlayer","used":true,"who":"Jason"},{"_id":"58a1170e421aa901ef40578d","createdAt":"2017-02-13T10:16:46.298Z","desc":"虽然是个简单的 Android App，但是几乎囊括了多数很酷的 Android 库和开发方法，测试方法，相当赞的一个值得学习的项目。","images":["http://img.gank.io/6a2b9df2-34b3-4b9d-bcfb-a5741e87760b"],"publishedAt":"2017-02-13T11:54:17.922Z","source":"chrome","type":"Android","url":"https://github.com/athkalia/Just-Another-Android-App","used":true,"who":"代码家"},{"_id":"58a129ff421aa901f7902c6e","createdAt":"2017-02-13T11:37:35.495Z","desc":"Android Notification 详解","images":["http://img.gank.io/2c58c211-9685-4b4e-ba2c-c725a442095f"],"publishedAt":"2017-02-13T11:54:17.922Z","source":"web","type":"Android","url":"http://reezy.me/2016/12/28/android-notification/","used":true,"who":"ezy"},{"_id":"589d2bcd421aa9270bc7332c","createdAt":"2017-02-10T10:56:13.792Z","desc":"Android 信用卡提交效果。","images":["http://img.gank.io/0df0d67f-6d39-4880-9a44-b2531ccb3a75"],"publishedAt":"2017-02-10T11:38:22.122Z","source":"chrome","type":"Android","url":"https://github.com/adonixis/android-sumbit-credit-card-flow","used":true,"who":"代码家"},{"_id":"589d2bed421aa92710db9613","createdAt":"2017-02-10T10:56:45.622Z","desc":"简洁优雅的网络状态提示。","images":["http://img.gank.io/93211cbf-d4af-4bc4-ba76-621dfb1dfe40"],"publishedAt":"2017-02-10T11:38:22.122Z","source":"chrome","type":"Android","url":"https://github.com/iammert/StatusView","used":true,"who":"代码家"}]
     */

    private boolean error;
    private List<ResultsEntity> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public static class ResultsEntity {
        /**
         * _id : 58a2780e421aa901f7902c7d
         * createdAt : 2017-02-14T11:22:54.87Z
         * desc : Material Design 风格的 About 页面
         * images : ["http://img.gank.io/1b5d9fb5-689c-4f5c-a33c-c2a9323ac87d","http://img.gank.io/aaa8a306-3124-4197-ad4e-ff3deec459c8"]
         * publishedAt : 2017-02-14T11:42:37.303Z
         * source : chrome
         * type : Android
         * url : https://github.com/jrvansuita/MaterialAbout
         * used : true
         * who : 代码家
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}