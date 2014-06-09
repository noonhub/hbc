package com.twitter.hbc.core.endpoint;

import com.twitter.hbc.core.HttpConstants;

public class BaseEnterpriseStreamingEndpoint implements StreamingEndpoint {
  protected static final String BASE_PATH = "https://stream.gnip.com:%d/accounts/%s/publishers/twitter/streams/track/%s.json";
  protected static final int PORT = HttpConstants.DEFAULT_HTTPS_PORT;
  protected final String account;
  protected final String label;
  protected int clientId;

  public BaseEnterpriseStreamingEndpoint(int clientId, String account, String label) {
    this.clientId = clientId;
    this.account = account;
    this.label = label;
  }

  public int getClientId() { return clientId; }
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

  @Override
  public String getQueryParamString() {
    return "";
  }

  @Override
  public void addQueryParameter(String param, String value) {
    // No-op
  }
}
