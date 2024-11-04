package io.github.patrickbelanger.groq.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroqModelResponseDTO {
    private String id;
    private long created;
    @JsonProperty("owner_by")
    private String ownedBy;
    private boolean active;
    private int contextWindow;
    @JsonProperty("public_apps")
    private String publicApps = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getContextWindow() {
        return contextWindow;
    }

    public void setContextWindow(int contextWindow) {
        this.contextWindow = contextWindow;
    }

    public String getPublicApps() {
        return publicApps;
    }

    public void setPublicApps(String publicApps) {
        this.publicApps = publicApps;
    }
}
