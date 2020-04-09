package com.bingley.learning.desiner.builder;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class HttpTool {

    private final String url;
    private final String ip;

    public String getUrl() {
        return url;
    }

    public String getIp() {
        return ip;
    }

    private HttpTool(HttpToolBuilder httpToolBuilder) {
        this.url = httpToolBuilder.url;
        this.ip = httpToolBuilder.ip;
    }

    public static class HttpToolBuilder {
        public String url;
        public String ip;

        public HttpToolBuilder url(String urls) {
            url = urls;
            return this;
        }


        public HttpTool create(){
            return new HttpTool(this);
        }
    }

}
