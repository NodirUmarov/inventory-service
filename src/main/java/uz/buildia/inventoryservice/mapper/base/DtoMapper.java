package uz.buildia.inventoryservice.mapper.base;

public interface DtoMapper<D, E> {
    D toDto(E entity);
    
}
