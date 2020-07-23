package com.nbi.spqr.repository;

import com.nbi.spqr.dto.NbiResponse;
import com.nbi.spqr.entity.Nbi_prequal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface NbiRepository extends JpaRepository<Nbi_prequal,Integer> {

    @Query("SELECT new com.nbi.spqr.dto.NbiResponse(c.Eir_code , c.Product_code, c.Flag) FROM Nbi_prequal c")
    public Optional<NbiResponse> getJoinInformation();

    /*@Query("SELECT new com.nbi.spqr.dto.OrderResponse(c.firstname , p.productName) FROM Customer c INNER JOIN c.products p ON c.firstname = p.productName")
    public List<OrderResponse> getInnerJoinInformation();*/

}
