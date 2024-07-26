package uz.buildia.inventoryservice.mapper.base;

public interface EntityMapper<E, D> {
    E toEntity(D dto);
}
