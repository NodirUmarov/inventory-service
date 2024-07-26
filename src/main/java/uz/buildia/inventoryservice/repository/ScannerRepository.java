package uz.buildia.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.buildia.inventoryservice.entity.Scanner;

@Repository
public interface ScannerRepository extends JpaRepository<Scanner, String> {
}