package fr.inserm.umr915.knime4ngs.nodes.vcf.bedfile;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;


/**
 * <code>NodeFactory</code> for the "VCFSource" Node.
 * Reads a VCF file
 *
 * @author Pierre Lindenbaum
 */
public class BedFileNodeFactory
        extends NodeFactory<BedFileNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public BedFileNodeModel createNodeModel() {
        return new BedFileNodeModel();
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
    public NodeView<BedFileNodeModel> createNodeView(final int viewIndex,
            final BedFileNodeModel nodeModel) {
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
        return new BedFileNodeDialog();
    }

}

