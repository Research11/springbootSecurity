package com.pb.Config.propertes;


public class SocialProperties {

    private String filterProcessesUrl = "/auth";

    private String socialRedirectUrl = "";

    private String socialBindUrl = "";

    private String socialRegistUrl = "";


    public String getFilterProcessesUrl() {
        return filterProcessesUrl;
    }

    public void setFilterProcessesUrl(String filterProcessesUrl) {
        this.filterProcessesUrl = filterProcessesUrl;
    }

    public String getSocialRedirectUrl() {
        return socialRedirectUrl;
    }

    public void setSocialRedirectUrl(String socialRedirectUrl) {
        this.socialRedirectUrl = socialRedirectUrl;
    }

    public String getSocialBindUrl() {
        return socialBindUrl;
    }

    public void setSocialBindUrl(String socialBindUrl) {
        this.socialBindUrl = socialBindUrl;
    }

    public String getSocialRegistUrl() {
        return socialRegistUrl;
    }

    public void setSocialRegistUrl(String socialRegistUrl) {
        this.socialRegistUrl = socialRegistUrl;
    }

   
}
