package training.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import training.model.Example;

public interface ExampleMapper {

    /** Lista todas as entidades */
    List<Example> list();

    /** Encontra uma entidade com ID especificado. */
    Example find(@Param("id") int id);

    /** Insere uma entidade nova */
    void insert(Example example);
    
    /** Atualiza uma entidade existente. */
    void update(Example example);
    
    /** Apaga uma entidade. */
    void delete(@Param("id") int id);
}