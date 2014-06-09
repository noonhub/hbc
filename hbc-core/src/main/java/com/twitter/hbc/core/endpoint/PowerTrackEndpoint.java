package com.twitter.hbc.core.endpoint;

public class PowerTrackEndpoint implements StreamingEndpoint {
  public static final String BASE_PATH = "/accounts/%s/publishers/twitter/streams/track/%s.json";
  private final String account;
  private final String label;
  private boolean backfillable;
  private int clientId;

  public PowerTrackEndpoint(String account, String label, boolean backfillable) {
    this.account = account;
    this.label = label;
    this.backfillable = backfillable;
  }

  public void setClientId(int clientId) {
    this.clientId = clientId;
  }

  @Override
  public String getURI() {
    return String.format(BASE_PATH, account.trim(), label.trim());
  }

  @Override
  public String getHttpMethod() {
    return "GET";
  }

  @Override
  public String getPostParamString() {
    return null;
  }

  @Override
  public void addPostParameter(String param, String value) {
    //No-op
  }

  @Override
  public void removePostParameter(String param) {
    //No-op
  }

  @Override
  public void setBackfillCount(int count) {
    //No-op
  }

  @Override
  public void setApiVersion(String apiVersion) {
    //No-op
  }
}
