package com.twitter.hbc.core.endpoint;

public class BaseEnterpriseStreamingEndpoint implements StreamingEndpoint {


  // These don't do anything
  @Override
  public void setBackfillCount(int count) {}

  @Override
  public void setApiVersion(String apiVersion) {}

  @Override
  public String getURI() {
    return null;
  }

  @Override
  public String getHttpMethod() {
    return null;
  }

  @Override
  public String getPostParamString() {
    return null;
  }

  @Override
  public void addPostParameter(String param, String value) {
  }

  @Override
  public void removePostParameter(String param) {
  }
}
