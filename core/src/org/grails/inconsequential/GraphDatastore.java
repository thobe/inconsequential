package org.grails.inconsequential;

import java.util.Map;

/**
 * @author Guillaume Laforge
 * @author Tobias Ivarsson
 */
public interface GraphDatastore<K> extends Datastore
{
    Key<K> createRelationship( Context ctxt, Key<K> start, String type,
            Key<K> end, Map<String, Object> object );

    Iterable<Key<K>> getAllRelationships( Context ctxt, Key<K> node );

    Iterable<Key<K>> getAllRelationships( Context ctxt, Key<K> node,
            String type, String... moreTypes );

    Iterable<Key<K>> getIncomingRelationships( Context ctxt, Key<K> node );

    Iterable<Key<K>> getIncomingRelationships( Context ctxt, Key<K> node,
            String type, String... moreTypes );

    Iterable<Key<K>> getOutgoingRelationships( Context ctxt, Key<K> node );

    Iterable<Key<K>> getOutgoingRelationships( Context ctxt, Key<K> node,
            String type, String... moreTypes );

    Key<K> getStartNode( Context ctxt, Key<K> relationship );

    Key<K> getEndNode( Context ctxt, Key<K> relationship );
}
