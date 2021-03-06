package si.kamino.gradle.extensions.version

class BaseVersion extends AbsVersion {

    public Integer major
    public Integer minor
    public Integer build

    BaseVersion() {
    }

    protected BaseVersion(Integer major, Integer minor, Integer build) {
        this.major = major
        this.minor = minor
        this.build = build
    }

    void major(Integer major) {
        this.major = major
    }

    void minor(Integer minor) {
        this.minor = minor
    }

    void build(Integer build) {
        this.build = build
    }

    @Override
    Integer getMajor() {
        return major
    }

    @Override
    Integer getMinor() {
        return minor
    }

    @Override
    Integer getBuild() {
        return build
    }

}
