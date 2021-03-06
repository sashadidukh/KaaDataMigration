package org.kaaproject.data_migration.model;


public class CtlMetaInfo {

    public final String fqn;
    public final Long appId;
    public final Long tenatnId;

    public CtlMetaInfo(String fqn, Long appId, Long tenatnId) {
        this.fqn = fqn;
        this.appId = appId;
        this.tenatnId = tenatnId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CtlMetaInfo that = (CtlMetaInfo) o;

        return fqn != null ? fqn.equals(that.fqn) : that.fqn == null;

    }

    @Override
    public int hashCode() {
        return fqn != null ? fqn.hashCode() : 0;
    }
}
