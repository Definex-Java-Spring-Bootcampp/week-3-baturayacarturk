package com.patika.kredinbizdeservice.dto.response;

import com.patika.kredinbizdeservice.model.Application;

import java.util.List;

public class GetApplicationsByEmailResponse {
    private List<Application> applicationList;

    public GetApplicationsByEmailResponse() {
    }

    public GetApplicationsByEmailResponse(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    public List<Application> getApplicationList() {
        return this.applicationList;
    }

    public void setApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetApplicationsByEmailResponse)) return false;
        final GetApplicationsByEmailResponse other = (GetApplicationsByEmailResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$applicationList = this.getApplicationList();
        final Object other$applicationList = other.getApplicationList();
        if (this$applicationList == null ? other$applicationList != null : !this$applicationList.equals(other$applicationList))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetApplicationsByEmailResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $applicationList = this.getApplicationList();
        result = result * PRIME + ($applicationList == null ? 43 : $applicationList.hashCode());
        return result;
    }

    public String toString() {
        return "GetApplicationsByEmailResponse(applicationList=" + this.getApplicationList() + ")";
    }
}
