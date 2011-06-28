package fr.inserm.umr915.knime4ngs.nodes.vcf.bbfile;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;


/**
 * <code>NodeFactory</code> for the "VCFSource" Node.
 * Reads a VCF file
 *
 * @author Pierre Lindenbaum
 */
public class BigBedFileNodeFactory
        extends NodeFactory<BigBedFileNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public BigBedFileNodeModel createNodeModel() {
        return new BigBedFileNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<BigBedFileNodeModel> createNodeView(final int viewIndex,
            final BigBedFileNodeModel nodeModel) {
        throw new IllegalStateException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new BigBedFileNodeDialog();
    }

}

