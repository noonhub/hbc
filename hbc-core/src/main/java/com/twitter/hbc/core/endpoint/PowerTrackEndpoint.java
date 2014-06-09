package com.twitter.hbc.core.endpoint;

import com.twitter.hbc.core.HttpConstants;

public class PowerTrackEndpoint extends BaseEnterpriseStreamingEndpoint implements StreamingEndpoint {
  private static final String BASE_PATH = "https://stream.gnip.com:%d/accounts/%s/publishers/twitter/streams/track/%s.json";
  private static final int PORT = HttpConstants.DEFAULT_HTTPS_PORT;
  private boolean backfillable;

  public PowerTrackEndpoint(int clientId, String account, String label, boolean backfillable) {
    super(clientId, account, label);
    this.backfillable = backfillable;
  }

  public PowerTrackEndpoint(String account, String label, boolean backfillable) {
    super(0, account, label);
    this.backfillable = backfillable;
  }

  public void setClientId(int clientId) {
    this.clientId = clientId;
  }

  @Override
  public String getURI() {
    return String.format(BASE_PATH, PORT,account.trim(), label.trim());
  }

  @Override
  public String getHttpMethod() {
    return "GET";
  }

  @Override
  public String getPostParamString() {
    return "";
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
  public String getQueryParamString() {
    return "";
  }

  @Override
  public void addQueryParameter(String param, String value) {

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
