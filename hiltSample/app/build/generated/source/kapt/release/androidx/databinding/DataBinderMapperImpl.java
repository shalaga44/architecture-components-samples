package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.shalaga44.hiltsample.DataBinderMapperImpl());
  }
}
