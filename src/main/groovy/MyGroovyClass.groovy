import javax.inject.Inject

public class MyGroovyClass {

    @Inject
    protected int field // @PackageScope or no modifier cannot be used for processed fields!
}
