package io.elice.shoppingmall.util.mapsturct.item;

import io.elice.shoppingmall.domain.item.dto.result.ItemResult;
import io.elice.shoppingmall.domain.item.entity.Item;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-04T17:40:33+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class ItemResultMapperImpl implements ItemResultMapper {

    @Override
    public ItemResult toDto(Item entity) {
        if ( entity == null ) {
            return null;
        }

        ItemResult itemResult = new ItemResult();

        itemResult.setId( entity.getId() );
        itemResult.setName( entity.getName() );
        itemResult.setPrice( entity.getPrice() );
        itemResult.setDiscountPer( entity.getDiscountPer() );

        return itemResult;
    }

    @Override
    public List<ItemResult> toDtoList(List<Item> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ItemResult> list = new ArrayList<ItemResult>( entities.size() );
        for ( Item item : entities ) {
            list.add( toDto( item ) );
        }

        return list;
    }
}