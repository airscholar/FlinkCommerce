package Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesPerMonth {
    private int year;
    private int month;
    private double totalSales;
}
