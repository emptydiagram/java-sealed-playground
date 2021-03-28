package xyz.llamachannel.option;

public record None<T>() implements Option<T> {
  @Override
  public boolean isSome() {
    return false;
  }

  @Override
  public boolean isNone() {
    return true;
  }

  @Override
  public T unwrap() {
    throw new UnsupportedOperationException("Cannot unwrap None");
  }
}
