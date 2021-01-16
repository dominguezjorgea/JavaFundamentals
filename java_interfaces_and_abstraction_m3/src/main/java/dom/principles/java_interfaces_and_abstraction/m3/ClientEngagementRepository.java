package dom.principles.java_interfaces_and_abstraction.m3;

public interface ClientEngagementRepository extends AutoCloseable
{
    int NO_ID = 0;

    void add(ClientEngagement clientEngagement) throws RepositoryException;

    void remove(ClientEngagement clientEngagement) throws RepositoryException;

    Iterable<ClientEngagement> find(Query query) throws RepositoryException;
}