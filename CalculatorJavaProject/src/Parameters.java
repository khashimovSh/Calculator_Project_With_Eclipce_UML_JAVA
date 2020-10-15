import java.util.*;

public class Parameters {
	private class Parameter {
		final Class<?> type;
		final Object instance;

		Parameter(Class<?> type, Object instance) {
			this.type = type;
			this.instance = instance;
		}
	}

	private final Map<String, Parameter> entries = new HashMap<>();

	public <T> Parameters put(String name, Class<T> type, T instance) {
		Parameter parameter = entries.get(name);
		if (parameter != null)
			throw new RuntimeException("Name already registered: " + name);
		entries.put(Objects.requireNonNull(name), new Parameter(type, instance));
		return this;
	}

	public <T> T get(String name, Class<T> type) {
		Parameter parameter = entries.get(name);
		if (parameter == null)
			throw new RuntimeException("Invalid parameter name: " + name);
		else if (!type.equals(parameter.type))
			throw new RuntimeException("Incompatible types");
		return type.cast(parameter.instance);
	}
}
