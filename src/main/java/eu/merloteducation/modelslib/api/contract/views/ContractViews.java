package eu.merloteducation.modelslib.api.contract.views;

public interface ContractViews {
    public interface InternalView {
    }
    public interface BasicView {
    }

    public interface DetailedView extends BasicView {
    }

    public interface ConsumerView extends DetailedView {
    }

    public interface ProviderView extends DetailedView {
    }
}
